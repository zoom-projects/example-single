package com.hb0730.zoom.base.granter;

import com.hb0730.zoom.base.R;
import com.hb0730.zoom.base.model.dto.LoginInfo;
import com.hb0730.zoom.base.service.CaptchaService;
import com.hb0730.zoom.modules.sys.model.entity.SysUser;
import com.hb0730.zoom.modules.sys.service.SysUserService;
import com.hb0730.zoom.mybatis.core.encrypt.MybatisEncryptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * 手机号码登录
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/10/3
 */
@Component(MobileTokenGranter.GRANT_TYPE)
@RequiredArgsConstructor
public class MobileTokenGranter extends AbstractTokenGranter {
    public static final String GRANT_TYPE = "mobile";
    private final CaptchaService captchaService;
    private final SysUserService userService;
    private final MybatisEncryptService encryptService;

    @Override
    protected R<String> checkParam(LoginInfo loginInfo) {
        String mobile = loginInfo.getUsername();
        String code = loginInfo.getPassword();
        if (mobile == null || code == null) {
            return R.NG("手机号码或验证码不能为空");
        }
        return R.OK();
    }

    @Override
    protected R<String> checkCaptcha(LoginInfo loginInfo) {
        return captchaService.checkCaptcha(loginInfo.getUsername(), loginInfo.getPassword());
    }

    @Override
    protected Optional<SysUser> getUser(LoginInfo loginInfo) {
        String _username = encryptService.encrypt(loginInfo.getUsername());
        return Optional.ofNullable(userService.findByPhone(_username));
    }
}

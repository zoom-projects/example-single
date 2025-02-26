package com.hb0730.zoom.modules.sys.convert;

import com.hb0730.zoom.base.mapstruct.BizMapstruct;
import com.hb0730.zoom.modules.sys.model.entity.SysUser;
import com.hb0730.zoom.modules.sys.model.request.user.SysUserCreateRequest;
import com.hb0730.zoom.modules.sys.model.request.user.SysUserUpdateRequest;
import com.hb0730.zoom.modules.sys.model.vo.SysUserVO;
import org.mapstruct.Mapper;

/**
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/9/25
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface SysUserConvert extends BizMapstruct<SysUserVO, SysUser, SysUserCreateRequest, SysUserUpdateRequest> {

}

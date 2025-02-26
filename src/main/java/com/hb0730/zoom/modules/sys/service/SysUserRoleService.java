package com.hb0730.zoom.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hb0730.zoom.modules.sys.mapper.SysUserRoleMapper;
import com.hb0730.zoom.modules.sys.model.entity.SysUserRole;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/10/15
 */
@Service
public class SysUserRoleService extends ServiceImpl<SysUserRoleMapper, SysUserRole> {


    /**
     * 根据用户ID删除
     *
     * @param userId 用户ID
     * @return 是否成功
     */
    public boolean deleteByUserId(String userId) {
        return baseMapper.deleteByUserId(userId) > 0;
    }
}

package com.hb0730.zoom.modules.sys.convert;

import com.hb0730.zoom.base.mapstruct.BizMapstruct;
import com.hb0730.zoom.modules.sys.model.entity.SysPermission;
import com.hb0730.zoom.modules.sys.model.request.permission.SysPermissionCreateRequest;
import com.hb0730.zoom.modules.sys.model.vo.SysPermissionTreeVO;
import com.hb0730.zoom.modules.sys.model.vo.SysPermissionVO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 菜单与权限 转换
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/10/5
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface SysPermissionConvert extends BizMapstruct<SysPermissionVO, SysPermission,
        SysPermissionCreateRequest, SysPermissionCreateRequest> {
    /**
     * entity to vo
     *
     * @param entity entity
     * @return vo
     */
    List<SysPermissionTreeVO> toTreeVo(List<SysPermission> entity);
}

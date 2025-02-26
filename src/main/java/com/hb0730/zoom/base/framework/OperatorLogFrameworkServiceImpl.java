package com.hb0730.zoom.base.framework;

import com.hb0730.zoom.modules.sys.service.SysOperatorLogService;
import com.hb0730.zoom.operator.log.core.model.OperatorLogModel;
import com.hb0730.zoom.operator.log.core.service.OperatorLogFrameworkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 操作日志包 实现类
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/10/10
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class OperatorLogFrameworkServiceImpl implements OperatorLogFrameworkService {
    private final SysOperatorLogService operatorLogService;

    @Override
    public void insert(OperatorLogModel model) {
        operatorLogService.insertOperatorLog(model);
    }
}

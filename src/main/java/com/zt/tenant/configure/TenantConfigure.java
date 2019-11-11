package com.zt.tenant.configure;

import com.zt.tenant.enums.IsolationMode;
import com.zt.tenant.enums.Orm;
import lombok.Data;

/**
 * 配置信息
 */
@Data
public class TenantConfigure {

    /**
     * 默认租户id隔离
     */
    private IsolationMode isolationMode = IsolationMode.ID ;

    /**
     * 默认jpa实现
     */
    private Orm orm = Orm.JPA ;








}

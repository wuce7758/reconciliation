package com.froad.recon.importfile.dao;

import java.util.List;
import java.util.Map;

/**
 * 导入数据DAO接口
 * @author Administrator
 *
 */
public interface ImpDataDao {

	/**
     * 添加
     * @param list
     * @return 本次成功记录数
     */
    public int addList(List<Map<String,Object>> list);
    
    /**
     * 删除对账数据
     * @param sql
     * @return
     */
    public int delReconData(String sql);
}

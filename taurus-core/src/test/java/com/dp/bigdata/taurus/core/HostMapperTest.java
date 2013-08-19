package com.dp.bigdata.taurus.core;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dp.bigdata.taurus.generated.mapper.HostMapper;
import com.dp.bigdata.taurus.generated.mapper.TaskMapper;
import com.dp.bigdata.taurus.generated.module.Host;
import com.dp.bigdata.taurus.generated.module.Task;

/**
 * 
 * ImportDataTest
 * @author damon.zhu
 *
 */
public class HostMapperTest extends AbstractDaoTest {

    @Autowired
    private HostMapper hostMapper;
    @Autowired
    private TaskMapper taskMapper;
    
//    @Test
//    public void insertHostData(){
//        Host record = hostMapper.selectByPrimaryKey("HADOOP");
//        String ip = record.getIp();
//        assertEquals("10.1.77.84", ip);
//    }
    
    @Override
    protected void loadData() {
        Host record = new Host();
        record.setIp("10.1.77.84");
        record.setName("HADOOP");
        record.setPoolid(1);
        hostMapper.insertSelective(record);
    }
    
    @Test
    public void insertTaskData(){
        //List<Task> tasks = taskMapper.selectByCreatorInSameGroup("renyuan.sun");
        //System.out.println(tasks.size());
    }
    
    
    
    
}

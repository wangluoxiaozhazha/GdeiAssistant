package edu.gdei.gdeiassistant.Repository.Mysql.GdeiAssistantData.Reading;

import edu.gdei.gdeiassistant.Pojo.Entity.Reading;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReadingMapper {

    @Select("select * from reading")
    @ResultType(Reading.class)
    public List<Reading> selectReadingList();

    @Insert("insert into reading (title,description,link) values(#{title},#{description},#{link})")
    public void insertReadingList(Reading reading);
}

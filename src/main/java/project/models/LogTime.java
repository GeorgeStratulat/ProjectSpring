package project.models;

/**
 * Created by George Stratulat on 18/04/2018.
 */

/**import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LogTime {
    private String taskName;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="GMT")
    private Date startTime;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="GMT")
    private Date endTime;

    public LogTime(){}

    public LogTime(String taskName, Date startTime, Date endTime){
        this.taskName = taskName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }

    public Date getStartTime(){
        return this.startTime;
    }

    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }

    public Date getEndTime(){
        return this.endTime;
    }
}
*/
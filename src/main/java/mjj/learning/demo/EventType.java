package mjj.learning.demo;

public enum EventType {
    /** 课程事件 */
    LESSON("lesson"),
    /** 帖子事件 */
    POST("post"),
    /** 测验事件 */
    QUIZ("quiz"),
    /** 考试事件 */
    EXAM("exam"),
    /** 作业事件 */
    HOMEWORK("homework"),
    /** 系统时间 */
    SYSTEM("system")
    ;

    private String description;

    EventType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

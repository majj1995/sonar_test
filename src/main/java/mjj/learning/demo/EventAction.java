package mjj.learning.demo;

public enum EventAction {
    /** 参与 */
    PARTICIPATE("participate"),
    /** 完成 */
    COMPLETE("complete"),
    /** 创建 */
    INITIATE("initiate"),
    /** 登录 */
    LOGIN("login")
    ;

    private String description;

    EventAction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

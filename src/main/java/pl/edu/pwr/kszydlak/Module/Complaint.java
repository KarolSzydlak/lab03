package pl.edu.pwr.kszydlak.Module;

public class Complaint {
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private int id;

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    private int clientid;

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    private int itemid;

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    private String reportdate;
    private String passdate;
    private String replydate;
    private String enddate;

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
}

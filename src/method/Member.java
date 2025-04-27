package method;

public class Member {
    private String id;
    private String name;
    private String job;
    private String status; 

    public Member(String id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.status = "Available";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getJob(){
        return job;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status; // Update status jadi Borrowing
    }

    public void resetStatus() {
        this.status = "Available";
    }
}

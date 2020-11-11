
package Customer;

public class Details {
    private String name;
    private Long contact;

    public Details(String name,  Long contact) {

        this.setName(name);
        this.setContact(contact);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }


}

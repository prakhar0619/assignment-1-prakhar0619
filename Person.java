package definition;

public class Person {
    //Declaring all the Variables , that will get used
    private String contactFirstName;
    private String contactLastName;
    private String[] contactNumber;
    private String emailOfContact;

    public Person(String contactFirstName, String contactLastName, String[] contactNumber, String emailOfContact) {
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactNumber = contactNumber;
        this.emailOfContact = emailOfContact;
    }
    //Creating Getter methods.
    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String[] getContactNumber() {
        return contactNumber;
    }

    public String getEmailOfContact() {
        return emailOfContact;
    }

    //Created Setter methods.
    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public void setContactNumber(String[] contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmailOfContact(String emailOfContact) {
        this.emailOfContact = emailOfContact;
    }



    public String toString(){
        //System.out.println("---Here are all your contacts---");
        final StringBuffer conapp = new StringBuffer("-------- * -------- * -------- * --------\n");
        conapp.append("First Name: ").append(contactFirstName).append("\n");
        conapp.append("Last Name: ").append(contactLastName).append("\n");
        conapp.append("Contact Number(s): ");//.append("\n");
        for (int i =0 ; i<contactNumber.length ; i++){
            conapp.append((contactNumber[0] != null && i == 0 ? contactNumber[0] : "") + (contactNumber[1] != null && i == 1 ? ", " + contactNumber[1] : "") +
                    (contactNumber[2] != null && i == 2 ? ", " + contactNumber[i] : ""));

        }
        conapp.append("\nEmail Address: ").append(emailOfContact).append("\n");
        conapp.append("-------- * -------- * -------- * --------");
        return conapp.toString();

    }


}
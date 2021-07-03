import java.util.Date;

public class Record {

//7.	Группы в которую занесен абонент (Enum с названиями групп).


    private String secondName;
    private String firstName;
    private String patronymic;
    private String shortFullNameVariant;
    private String nickname;
    private String comment;

    public Record(){}
    public Record(String secondName, String firstName,
                  String patronymic, String nickname,
                  String comment, String homePhoneNumber,
                  String mobilePhoneNumber, String mobilePhoneNumberAdditional,
                  String email, String skype, Address address) {

        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.shortFullNameVariant = secondName+" "+firstName.charAt(0)+".";
        this.nickname = nickname;
        this.comment = comment;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.mobilePhoneNumberAdditional = mobilePhoneNumberAdditional;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.addressString = "Index: "+address.getIndex()+
                                 "; Address: "+address.getCity()+", street "+
                                  address.getStreet()+","+
                                  address.getBuildingNumber();
        if(address.getFlatNumber()!=null){
            this.addressString = (this.addressString + ", "+address.getFlatNumber());
        }

        this.dateOfCreating = new Date();
        this.dateOfChange = new Date();
    }

    //enum Group;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String mobilePhoneNumberAdditional;
    private String email;
    private String skype;
    private Address address;
    private String addressString;
    private Date dateOfCreating;
    private Date dateOfChange;






}

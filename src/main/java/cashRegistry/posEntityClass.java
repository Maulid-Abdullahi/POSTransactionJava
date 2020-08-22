package cashRegistry;
import javax.persistence.*;

@Entity
@Table(name="transactions")
public class posEntityClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String AccNo;

    @Column
    private String Amount;

    public posEntityClass() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}
//    create table tutorials_tbl(
//       id INT NOT NULL AUTO_INCREMENT,
//       AccNo VARCHAR(100) NOT NULL,
//       Amount VARCHAR(40) NOT NULL,
//       PRIMARY KEY ( id )
//);
package net.javaguides.springbootforhaulmont.entityes;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table("Client")
    public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Client_id")
    private UUID id;

    @Column(name = "fio")
    private String fio;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "passport_number")
    private String passportNumber;

    @ManyToOne
    @JoinColumn(name = "Bank_id")
    private Bank bank;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
      private List <OfferOfCredit> offerOfCredits;

    public Client() {
    }
}

package com.htp.domain.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "poll")
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_poll")
    private long idPoll;

    @Column(name = "question")
    private String question;

    public Poll() {
    }

    public Poll(String question, Long idPoll) {
        this.idPoll = idPoll;
        this.question = question;
    }

    public long getIdPoll() {
        return idPoll;
    }

    public void setIdPoll(long idPoll) {
        this.idPoll = idPoll;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
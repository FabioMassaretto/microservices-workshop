package br.com.accenture.wallet.account.domain;

public class CustomerModel {
    private String id;
    private String name;

    public CustomerModel() {
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}

package com.example.activity21;

public class Dog {
    private String perrito, peso;

    public Dog(){
    }

    public Dog(String name, String hobby, String age, String phone, String address){
        this.perrito = name;
        this.peso = hobby;
    }

    public String getPerrito() {
        return perrito;
    }

    public void setPerrito(String perrito) {
        this.perrito = perrito;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}

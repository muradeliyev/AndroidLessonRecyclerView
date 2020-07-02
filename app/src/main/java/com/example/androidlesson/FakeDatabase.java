package com.example.androidlesson;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {

    private List<Chat> listOfChats = new ArrayList<>();

    public FakeDatabase() {
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Eliyev Cavad", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Eliyev Cavad", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat\nDescription of Cavad Eliyev's chat\nDescription of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Eliyev Cavad", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Eliyev Cavad", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Eliyev Cavad", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Eliyev Cavad", "Description of Cavad Eliyev's chat"));
        listOfChats.add(new Chat("", "Cavad Eliyev", "Description of Cavad Eliyev's chat"));
    }

    public List<Chat> getListOfChats() {
        return listOfChats;
    }

}

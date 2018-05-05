package com.company.HW_2;

public class AudioFormatException extends Exception {
    public AudioFormatException(String message){
        super(message+"\n"+"Неподдерживаемый формат аудио. . .\n");
    }
}

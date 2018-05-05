package com.company.HW_2;

public class MP3player extends Player {
    @Override
    public void play(Track track) throws AudioFormatException{
        if(!"mp3".equalsIgnoreCase(track.getFormat())){
           throw new AudioFormatException("Невозможно воспроизвести трэк ~ "+"\""+track.getName()+"\"");
        }
        super.play(track);
    }
}

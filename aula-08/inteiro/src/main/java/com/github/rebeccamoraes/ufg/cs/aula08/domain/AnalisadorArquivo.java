package com.github.rebeccamoraes.ufg.cs.aula08.domain;

import java.io.*;
import java.util.Scanner;

public class AnalisadorArquivo {

    public static String prefixoHexadecimal(final String nomeArquivo)
            throws FileNotFoundException, UnsupportedEncodingException, IOException {

        FileInputStream fis = new FileInputStream(nomeArquivo);
        DataInputStream lerArquivo = new DataInputStream(fis);
        byte[] bytes = new byte[4];

        for(int i = 0; i < 4; i++) {
            bytes[i] = lerArquivo.readByte();
        }


        StringBuilder sb = new StringBuilder();

        for(byte b : bytes){
            sb.append(String.format("%02x", b));
        }

        String prefixo = sb.toString();

        return prefixo;
    }
}

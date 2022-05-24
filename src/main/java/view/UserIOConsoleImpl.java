/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Zaw L Than
 */
public class UserIOConsoleImpl implements UserIO {
        final private Scanner console = new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
    
    
    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return console.nextLine();
    }

    
    @Override
    public int readInt(String prompt) {
        boolean invalidInput = true;
        int num = 0;
        
        while (invalidInput) {
            try {
                String stringValue = this.readString(prompt);
                num = Integer.parseInt(stringValue);
                invalidInput = false;
            }
            catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
        return num;
    }

    
    @Override
    public int readInt(String prompt, int min, int max) {
        int result;
        do {
            result = readInt(prompt);
        } while (result < min || result > max);
        return result;
    }
    
    
    @Override
    public long readLong(String prompt) {
        while (true) {
            try {
                return Long.parseLong(this.readString(prompt));
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long result;
        do {
            result = readLong(prompt);
        } while (result < min || result > max);
        return result;
    }
    
    
    @Override
    public float readFloat(String prompt) {
        while (true) {
            try {
                return Float.parseFloat(this.readString(prompt));
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float result;
        do {
            result = readFloat(prompt);
        } while (result < min || result > max);
        return result;
    }
    
    
    @Override
    public double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(this.readString(prompt));
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double result;
        do {
            result = readDouble(prompt);
        } while (result < min || result > max);
        return result;
    }
}

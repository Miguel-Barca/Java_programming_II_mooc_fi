/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Ticket {
    private int seat;
    private int code;
    private Show show;

    public Ticket(int seat, int code, Show show) {
        this.seat = seat;
        this.code = code;
        this.show = show;
    }
    
    
}

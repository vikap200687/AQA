package CodeWars;

public class Bob {
    public static int enough(int cap, int on, int wait){
        int free = cap - on; //количество свободных мест
        int tail = 0; //остаток людей на оствновке
        if (free < wait)
        {
            // вычиляем кол-во пассажиров, кот не поместились
            tail = wait - free;
        }
        return tail;
    }
}

package javaio;

import entity.ThongTinBang;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/tomandjerry.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            System.out.println(line);
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                String view = splitted[3];
                System.out.println("day: " + day);
                System.out.println("id: " + id);
                System.out.println("title: " + title);
                System.out.println("view: " + view);
            }
            count++;
        }
        ArrayList<ThongTinBang> list =new ArrayList<ThongTinBang>();
        ThongTinBang L1 =new ThongTinBang("16/04/2019","VID00123","Tom Jerry 01","2500");
        ThongTinBang L2 =new ThongTinBang("16/04/2019","VID00124","Tom Jerry 02","1000");
        ThongTinBang L3 =new ThongTinBang("16/04/2019","VID00125","Tom Jerry 03","800");
        ThongTinBang L4 =new ThongTinBang("17/04/2019","VID00123","Tom Jerry 01","1800");
        ThongTinBang L5 =new ThongTinBang("17/04/2019","VID00124","Tom Jerry 02","500");
        ThongTinBang L6 =new ThongTinBang("17/04/2019","VID00125","Tom Jerry 03","300");
        ThongTinBang L7 =new ThongTinBang("17/04/2019","VID00126","Tom Jerry 04","100");
        ThongTinBang L8 =new ThongTinBang("18/04/2019","VID00123","Tom Jerry 01","1500");
        ThongTinBang L9 =new ThongTinBang("18/04/2019","VID00124","Tom Jerry 02","1300");
        list.add(L1);
        list.add(L2);
        list.add(L3);
        list.add(L4);
        list.add(L5);
        list.add(L6);
        list.add(L7);
        list.add(L8);
        list.add(L9);
        HashMap<String, ThongTinBang> statistic =new HashMap<String, ThongTinBang>();
        for (ThongTinBang information:list){
            int countView =0;
            if (statistic.containsKey(information.getId())){
                ThongTinBang thongTinBang = statistic.get(information.getId());
                countView = Integer.parseInt(thongTinBang.getView());

            }
            countView = countView + Integer.parseInt(information.getView());
            ThongTinBang thongTinBang1 =new ThongTinBang(information.getDay(),information.getId(),
                    information.getTitle(),Integer.toString(countView));
            statistic.put(information.getId(),thongTinBang1);

        }
        for (String id:statistic.keySet()){
            System.out.println("-----------------------------");
//            System.out.println(id);
            ThongTinBang thongTinBang =statistic.get(id);
            System.out.println("Ngay: " +thongTinBang.getDay());
            System.out.println("Id video: " + thongTinBang.getId());
            System.out.println("Tieu de: " + thongTinBang.getTitle());
            System.out.println("Tong so view: " + thongTinBang.getView());
            System.out.println("----------------------------");

        }







    }
}

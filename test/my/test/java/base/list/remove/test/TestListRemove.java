package my.test.java.base.list.remove.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TestListRemove {

    public static void main(String[] args) {
        TestListRemove testListRemove= new TestListRemove();
        testListRemove.testSet();
        
    }
    
    private void testList(){
        List<Long> mainSkuList = new ArrayList<Long>();
        Long first = 1010001L;
        Long second = 1010002L;
        long firstMin = 1010001;
        long secondMin = 1010002;
        mainSkuList.add(first);
        mainSkuList.add(second);
        mainSkuList.add(firstMin);
        mainSkuList.add(secondMin);
        
        for(Long skuId : mainSkuList){
            System.out.println(skuId);
        }
        System.out.println("11111111111");
        mainSkuList.remove(new Long(1010001));
        mainSkuList.remove(0);
        System.out.println("222222222222");
        
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        for(Long skuId2 : mainSkuList){
            System.out.println(skuId2);
        }
    }
    
    private void testSet() {

        Set<Long> mainSkuList = new HashSet<Long>();
        Long first = 1010001L;
//        Long second = 1010002L;
//        Long third = 1010002L;
        long firstMin = 1010001;
        long secondMin = 1010002;
        long thridMin = 1010002;
        mainSkuList.add(first);
//        mainSkuList.add(second);
//        mainSkuList.add(third);
        mainSkuList.add(firstMin);
        mainSkuList.add(secondMin);
        mainSkuList.add(thridMin);
        
        for(Long skuId : mainSkuList){
            System.out.println(skuId);
        }
        
        System.out.println("11111100000");
        
        //移除有问题
        boolean fail = mainSkuList.remove(1010002);
        
        //成功移除
        boolean sucess = mainSkuList.remove(1010002L);
        
        System.out.println("222222222222"+sucess);
        
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        for(Long skuId2 : mainSkuList){
            System.out.println(skuId2);
        }
    }
    
}

import java.util.Arrays;//导入相关的包
public class Conta {
    public static void main(String[] args){
        int a[]={1,3,5,6,8,11};
        int b[]={2,4,7,9,10,12};
        int c[]=new int[a.length+b.length];  //为数组c开辟空间
        int x=0;
        int y=0;
        for(int i=0;i<a.length+b.length-1;i++) {//循环12次
            //比较两个数组的值，较小的那个赋予c，较大的那个保留与下一个数组的下一个值进行比较
            if(a[x]<b[y]){
                c[i]=a[x];
                x++;}
            else{
                c[i]=b[y];
                y++;}
        }
        if(a[a.length-1]<b[b.length-1]){ //补全上面判断的不足
            c[a.length+b.length-1]=b[b.length-1];
        }
        String cs= Arrays.toString(c);//将数组转换为字符串
        System.out.print(cs);
    }
}

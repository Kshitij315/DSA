package Problems;

public class Main {


    public static void main(String args[]) {
        PolynomialAddition obj = new PolynomialAddition();
        PolynomialAddition obj2 = new PolynomialAddition();
        obj.create_list();
        obj.read_polynomial(3);
        obj.print_list();
        obj2.create_list();
        obj2.read_polynomial(3);
        obj2.print_list();
        PolynomialAddition obj3 = new PolynomialAddition();
        obj3.create_list();
        PolynomialAddition.Node temp_r1 = obj.root;
        PolynomialAddition.Node temp_r2 = obj2.root;
        while (temp_r1 != null && temp_r2 != null)//read till both roots are not over(null)-loop {
//if temp_r1.power>temp_r2.power then insert node temp_r1 to obj3.insert_node if(temp_r1.power>temp_r2.power)
        {
            obj3.insert_node(temp_r1.co, temp_r1.power);
            temp_r1 = temp_r1.next;
        }
else if (temp_r1.power < temp_r2.power) {
            obj3.insert_node(temp_r2.co, temp_r2.power);
            temp_r2 = temp_r2.next;
        } else {
            obj3.insert_node(temp_r2.co + temp_r1.co, temp_r2.power);
            temp_r1 = temp_r1.next;
            temp_r2 = temp_r2.next;

        }


        while (temp_r1 != null)//read till both roots are not over(null)-loop
        {
            obj3.insert_node(temp_r1.co, temp_r1.power);
            temp_r1 = temp_r1.next;
        }
        while (temp_r2 != null)//read till both roots are not over(null)-loop {
            obj3.insert_node(temp_r2.co, temp_r2.power);
        temp_r2 = temp_r2.next;

        obj3.print_list();
    }
}




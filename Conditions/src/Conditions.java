
void main() {


            int salary = 21_000;
            if(salary > 25_000)
                salary += 1000;
            else if (salary <= 21000) {
                salary += 5000;
            }
            else if (salary > 21000 && salary <= 25000)
                salary += 3000;
            else
                salary += 0;

            System.out.println("Salary : " + salary);

}

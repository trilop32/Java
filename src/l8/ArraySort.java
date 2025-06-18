void main() {
    SecureRandom r = new SecureRandom();
    Scanner sc = new Scanner(System.in);
    print("Введите размер массива");
    int n=sc.nextInt();
    Integer m[] = new Integer[n];
    print("Before: ");
    for(int i=0;i<n;i++)
    {
        m[i]=r.nextInt(100);
        print(m[i]+" ");
    }
    System.out.println();
    System.out.print("After Arrays.sort: ");
    Arrays.sort(m, Collections.reverseOrder());
    println(Arrays.toString());
}

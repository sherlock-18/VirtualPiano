import java.util.*;
import java.io.*;

public class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static int sqr(int n){
          int ans=0;
          while(n>0){
            ans+=((n%10)*(n%10));
            n/=10;
          }
          return ans;
    }
    public static void main(String[] args) {
        try {
            int mod=1000000007;
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-->0){
                //code
                int n=in.nextInt();
                int m=in.nextInt();
                int[] arr = new int[n];
                int[] arr2 = new int[m];
                for(int i=0;i<n;i++)
                arr[i]=in.nextInt();
                for(int i=0;i<m;i++)
                arr2[i]=in.nextInt();
                Arrays.sort(arr2);
                long ans2=0;
                int l=0;
                int r=m-1;
                for(int i=n-1;i>=0;i--){
                  if(Math.abs((long)arr2[l]-arr[i])>Math.abs((long)arr2[r]-arr[i])){
                  ans2+=Math.abs((long)arr2[l]-arr[i]);
                  l++;
                  }
                  else{
                  ans2+=Math.abs((long)arr2[r]-arr[i]);
                  r--;
                  }
                }
                long ans3=0;
                l=0;
                r=m-1;
                for(int i=0;i<n;i++){
                  if(Math.abs((long)arr2[l]-arr[i])>Math.abs((long)arr2[r]-arr[i])){
                  ans3+=Math.abs((long)arr2[l]-arr[i]);
                  l++;
                  }
                  else{
                  ans3+=Math.abs((long)arr2[r]-arr[i]);
                  r--;
                  }
                }
                out.println(Math.max(ans3, ans2));
                //end
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
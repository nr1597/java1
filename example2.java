public class example2 {

    public float mean1(float a[],int n){
        float sum =0;
        float meann=0;
        for (int i=0;i<n;i++){
            sum += a[1];
        }
        meann = sum/n;
        return meann;
    }


    public float median1(float a[],int n) {
        int mid = n / 2;
        float mediann = 0;
        if (n / 2 == 1) {
            mediann = a[mid];
        } else {
            mediann = a[mid - 1] + a[mid] / 2;
        }
        return mediann;
    }

    public float mode1(float a[],int n){
        float modee = a[0];
        int count1 =0;
        float v = 0;
        for(int i=0;i<n;i++){
            float v = a[i];
            int count = 1;
            for(int j = 0;i<n;j++){
                if(a[j]==v){
                    count++;
                }
                if(count>count1){
                    modee = v;
                }

            }

        }
        return v;
        }




}

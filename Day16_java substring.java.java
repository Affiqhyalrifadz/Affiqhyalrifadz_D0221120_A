# Affiqhyalrifadz_D0221120_Aint lastIndex = s.length()-k;
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for (int i=0;i<=lastIndex;i++){
            String sub = s.substring(i, i+k);
            //System.out.println(sub);
            if(smallest.compareTo(sub)>0){
                smallest = sub;
            }
            if(largest.compareTo(sub)<0){
                largest = sub;
            }
        }

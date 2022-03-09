# Affiqhyalrifadz_D0221120_As = s.replaceAll("[!,?._'@\\s]"," ");
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}

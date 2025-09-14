/*
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 */
import java.util.List;
import java.util.Scanner;
public class a12matchingItems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int x = items.size();
        int n=0;
        int j=0;
        if(ruleKey.equals("type")){
            j=0;
        }
        else if(ruleKey.equals("color")){
            j=1;
        }
        else if(ruleKey.equals("name")){
            j=2;
        }
        for(int i=0; i<x; i++){
            if(items.get(i).get(j).equals(ruleValue)){
                n++;
            }
        }
        return n;
    }
}


package com.example.icici.lombard.service.care;

import com.example.icici.lombard.dto.care.request.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CareService {
    public IntPolicyDataIO getIntPolicyDataIO(IntPolicyDataIO intPolicyDataIO) {

        Policy policy = new Policy();
        policy.setBusinessTypeCd("NEWBUSINESS");
        policy.setBaseProductId("10001117");
        policy.setBaseAgentId("20008325");
        policy.setCoverType("INDIVIDUAL");
        policy.setSumInsured("001");
        policy.setTerm("1");
        policy.setIsPremiumCalculation("YES");
        policy.setAddOns("WBS1146,NCBS1145,AHCS1144");
        ArrayList<PartyContactDOList> partyContactDOList=new ArrayList<>();
        partyContactDOList.add(new PartyContactDOList("9892398089","MOBILE","+91"));

        ArrayList<PartyAddressDOList>partyAddressDOLists=new ArrayList<>();
        partyAddressDOLists.add(new PartyAddressDOList("1206","Maruthi nagar","PERMANENT","Nalgonda","Nalgonda","560072","ANDHRA PRADESH"));

        ArrayList<PartyEmailDOList> partyEmailDOList=new ArrayList<>();
        partyEmailDOList.add(new PartyEmailDOList("karan.churi@workindia.in","PERSONAL"));

        ArrayList<PartyIdentityDOList> partyIdentityDOList=new ArrayList<>();
        partyIdentityDOList.add(new PartyIdentityDOList("PAN"));

        ArrayList<Object> partyQuestionDOList=new ArrayList<>();
        partyQuestionDOList.add(new ArrayList<>());
        ArrayList<PartyDOList>partyDOListLis=new ArrayList<>();
        policy.setPartyDOList(partyDOListLis);
        partyDOListLis.add(new PartyDOList("08/12/1991","kpqui","MALE","99","70","QN6237993","kka",partyAddressDOLists,partyContactDOList,partyEmailDOList,partyIdentityDOList,"SELF","PROPOSER","MR",partyQuestionDOList));

        ArrayList<PolicyAdditionalFieldsDOList> policyAdditionalFieldsDOList = new ArrayList<>();
        policyAdditionalFieldsDOList.add(new PolicyAdditionalFieldsDOList("Partner_NB_PartnerName","xc","SISTER","YES","YES","YES"));


        policy.setPolicyAdditionalFieldsDOList(policyAdditionalFieldsDOList);
        intPolicyDataIO.setPolicy(policy);
        return intPolicyDataIO;
    }
}

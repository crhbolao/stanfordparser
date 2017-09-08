import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

import java.util.List;

/**
 * Created by sssd on 2017/9/7.
 */
public class HanLp {

    public static void main(String[] args) {
        String document = "（原标题：初中女生一学期旷课28天 开学被要求签安全承诺书） \" +\n" +
                "                \"9月1日，本是开学报名的日子，但上初二的秦同学却遭到学校“拒绝”。\" +\n" +
                "                \"班主任告诉她，因旷课太多，需要家长到学校签保证书，并要学校主管领导签字才可以上学。 \" +\n" +
                "                \"家长：女儿因常旷课 遭学校拒绝报名 “开学女儿去学校报名时，\" +\n" +
                "                \"班主任说女儿经常旷课不能报名，要我周一（9月4日）去学校写保证书，\" +\n" +
                "                \"还要找学校主管领导签字。”秦先生说。 秦先生介绍，几年前他与妻子离异，\" +\n" +
                "                \"女儿由他独自抚养。他老家是河南的，在汉中做装修生意，平时比较忙，无暇照看女儿。\" +\n" +
                "                \"女儿一直在汉中市南郑县大河坎九年制学校上学，今年9月份开学就该上初二了。\" +\n" +
                "                \"女儿学习成绩还不错，就是比较懒，不做作业，老旷课。“每次早上说好去上学，结果半路溜回家，\" +\n" +
                "                \"都是班主任打电话通知我才知道。”秦先生说，自己常常担心女儿跑出去了，可每次回家一看，\" +\n" +
                "                \"女儿旷课后就跑回家了，一般就是在家里玩、睡觉。 学校：一学期旷课28天 \" +\n" +
                "                \"学校担心孩子安全 9月5日下午，华商报记者来到大河坎九年制学校，就此事采访了\" +\n" +
                "                \"该校主管安全的副校长古仁喜。 古仁喜说，当时孩子回去给家长传达的信息有偏差，\" +\n" +
                "                \"他们学校不是不让孩子报名上学，而是需要家长来学校处理孩子上学期半学年旷课28天的事。 \" +\n" +
                "                \"“一学期在校时间就100天左右，该学生有近1/3的时间都旷课。一旦发生安全问题，\" +\n" +
                "                \"学校承担不起。”古仁喜说，要求该生家长来学校，就是商量如何避免孩子的安全问题。 \" +\n" +
                "                \"随后，古仁喜给记者提供了一份秦先生签字的安全承诺书和秦先生女儿的保证书。\" +\n" +
                "                \"安全承诺书显示，秦先生必须每天接送女儿上学放学，必须将女儿送到学校。\" +\n" +
                "                \"其女儿的保证书写着，她必须每天按时上学不再旷课，且按时完成作业。 结果：\" +\n" +
                "                \"承诺按时到校 目前已正常上课 古仁喜说，现在学校已经和家长达成共识，\" +\n" +
                "                \"以承诺书的方式监督该学生按时到校。 大河坎九年制学校校长明万海表示，\" +\n" +
                "                \"秦同学学习成绩优异，天资较好。上学期28天不来学校上课，成绩还考得不错。 \" +\n" +
                "                \"从秦先生提供其女儿的一份成绩单显示，其初一时各门成绩均在110分左右（满分120分）。\" +\n" +
                "                \"明万海介绍，秦同学所在的年级共有400多名学生，初一第一学期在全年级排第18名。 \" +\n" +
                "                \"9月6日晚，华商报记者与秦同学取得了联系，她说，每次旷课都是因为未完成作业，\" +\n" +
                "                \"怕老师责备才拖着不去。“我爸和学校老师把我管得太紧。我在家其实也不是睡觉，\" +\n" +
                "                \"做作业困了就趴在桌子上睡着了。” 目前，秦先生的女儿已经报名并正常上课。而且自从签订承诺书后\" +\n" +
                "                \"，秦同学表现很好，最近没有旷课不完成作业的情况。 本文来源：华商网-华商报 责任编辑：郭萍_B7442";
        List<String> sentenceList = HanLP.extractSummary(document, 1);
        System.out.println(sentenceList);
    }

}

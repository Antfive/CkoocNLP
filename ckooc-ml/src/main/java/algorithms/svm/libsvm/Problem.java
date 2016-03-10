package algorithms.svm.libsvm;

/**
 * 包含了训练集数据的基本信息
 * Created by yhao on 2016/3/10.
 */
public class Problem implements java.io.Serializable
{
	//定义了向量的总个数
	public int l;
	//分类类型值数组
	public double[] y;
	//训练集向量表
	public Node[][] x;
}

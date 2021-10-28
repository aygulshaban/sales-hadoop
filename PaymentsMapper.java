package SalesWork.SalesWorkHadoop;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class PaymentsMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>  {

	private final static IntWritable one = new IntWritable(1);
	
	@Override
	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		
		String line = value.toString();
		String[] PaymentType = line.split(","); 
		
		if(!PaymentType[3].equals("Payment_Type") && PaymentType.length == 12) {
			
		output.collect(new Text(PaymentType[3].trim()), one);
		
	}

}
}

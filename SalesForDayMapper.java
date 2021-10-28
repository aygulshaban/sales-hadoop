package SalesWork.SalesWorkHadoop.ThirdApp;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class SalesForDayMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {

	private final static IntWritable one = new IntWritable(1);
	
	@Override
	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		
		String line = value.toString();
		String[] SalesForDay = line.split(","); 
		
		if(!SalesForDay[0].equals("Transaction_date")) {
		
				output.collect(new Text(SalesForDay[0].substring(0, SalesForDay[0].indexOf(" ")).trim()), one);
			
	}

	}
	}

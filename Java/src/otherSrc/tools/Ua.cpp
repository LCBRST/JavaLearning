#include <iostream>
#include <cmath>
#include <cstdlib>

using namespace std;

int main()
{
	int n;

	cout << "A类不确定度由以下公式确定: " << endl;
	cout << '\t' << "   __________" << endl;
	cout << '\t' << "  /∑(si-s)^2" << endl;
	cout << '\t' << " /-----------" << endl;
	cout << '\t' << "√    (n-1)" << endl;
	cout << "i = 1, 2, 3 ... n, s 为平均值." << endl << endl;

	cout << "输入数据的个数(n>1): ";
	cin >> n;
	if (n > 1) {
		double *sta;
		double ava = 0, ua = 0;
		sta = new double[n];

		cout << "输入 " << n << " 个数据:" << endl;
		for (int i = 0; i < n; i++) {
			cin >> sta[i];
			ava += sta[i];
		}
		ava /= n;
		for (int i = 0; i < n; i++) {
			ua += pow(sta[i] - ava, 2);
		}
		ua /= n-1;
		ua = sqrt(ua);
		
		cout << "     平均值为: " << ava << endl;
		cout << "A类不确定度为: " << ua << endl;

		delete sta;
	} else
		cout << endl << "非法!" << endl;

#ifdef WIN32
	system("pause");
#endif

	return 0;
}

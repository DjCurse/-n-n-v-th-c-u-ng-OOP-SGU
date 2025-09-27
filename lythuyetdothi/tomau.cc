#include <iostream>
#include <cstdio>
using namespace std;

void readGraph(int a[100][100], int &n, const char *filename) {
    FILE *f = fopen(filename, "r");
    if (!f) {
        printf("Khong the mo file!\n");
        n = 0;
        return;
    }

    // Đọc số đỉnh n trước (giả sử file có n ở dòng đầu)
    fscanf(f, "%d", &n);

    // Đọc ma trận kề
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            fscanf(f, "%d", &a[i][j]);
        }
    }

    fclose(f);
}

void printGraph(int a[100][100], int n) {
    printf("Ma tran ke:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
}

void greedyColoring(int a[100][100], int n) {
    int color[100];       // màu của mỗi đỉnh
    bool available[100];  // kiểm tra màu nào có thể dùng

    // Khởi tạo: chưa có đỉnh nào được tô màu
    for (int i = 0; i < n; i++) {
        color[i] = -1;
    }

    // Tô màu cho đỉnh đầu tiên
    color[0] = 0;

    // Duyệt các đỉnh còn lại
    for (int u = 1; u < n; u++) {
        // Reset trạng thái màu
        for (int i = 0; i < n; i++) {
            available[i] = true;
        }

        // Đánh dấu các màu của đỉnh kề là không khả dụng
        for (int v = 0; v < n; v++) {
            if (a[u][v] == 1 && color[v] != -1) {
                available[color[v]] = false;
            }
        }

        // Tìm màu nhỏ nhất còn khả dụng
        int c;
        for (c = 0; c < n; c++) {
            if (available[c]) break;
        }
        color[u] = c;
    }

    // Xuất kết quả
    printf("\nKet qua to mau (dinh: mau):\n");
    for (int i = 0; i < n; i++) {
        printf("Dinh %d -> Mau %d\n", i+1, color[i]+1); // +1 cho đẹp
    }
}

int main() {
    int a[100][100], n;

    // Đọc đồ thị từ file graph.txt
    readGraph(a, n, "graph.txt");

    // In ma trận để kiểm tra
    printGraph(a, n);

    // Tô màu
    greedyColoring(a, n);

    return 0;
}

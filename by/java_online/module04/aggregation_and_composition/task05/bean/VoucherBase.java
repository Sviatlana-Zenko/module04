package by.java_online.module04.aggregation_and_composition.task05.bean;

import java.util.ArrayList;
import java.util.List;

public class VoucherBase {
    private List<TravelVoucher> vouchers;

    public VoucherBase() {
        vouchers = new ArrayList<>();
    }

    public VoucherBase(List<TravelVoucher> vouchers) {
        this.vouchers = vouchers;
    }

    public List<TravelVoucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<TravelVoucher> vouchers) {
        this.vouchers = vouchers;
    }

    public void addVoucherToBase(TravelVoucher voucher) {
        vouchers.add(voucher);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "vouchers: " + vouchers + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VoucherBase other = (VoucherBase) obj;
        if (vouchers == null) {
            if (other.vouchers != null)
                return false;
        } else if (!vouchers.equals(other.vouchers))
            return false;
        return true;
    }
}
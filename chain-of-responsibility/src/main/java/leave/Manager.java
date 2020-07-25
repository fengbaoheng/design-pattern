package leave;

public class Manager implements LeaveApproval {
    @Override
    public int allowedLeaveDays() {
        return 10;
    }

    @Override
    public boolean approveLeave(int days) {
        if (days > allowedLeaveDays()) {
            System.out.println("经理审批请假不通过!");
            return false;
        }
        System.out.println("经理审批请假通过!");
        return true;
    }
}

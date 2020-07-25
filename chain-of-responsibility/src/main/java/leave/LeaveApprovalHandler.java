package leave;

public class LeaveApprovalHandler {
    private LeaveApprovalHandler successor;
    private final LeaveApproval approval;

    public LeaveApprovalHandler(LeaveApproval approval) {
        this.approval = approval;
    }

    public boolean approveLeave(int days) {
        if (days > approval.allowedLeaveDays() && successor != null) {
            // 交由后续处理(如果有的话)
            return successor.approveLeave(days);
        } else {
            // 自己处理
            return approval.approveLeave(days);
        }
    }


    public void setSuccessor(LeaveApprovalHandler successor) {
        this.successor = successor;
    }
}

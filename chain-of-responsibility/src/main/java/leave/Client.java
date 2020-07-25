package leave;

public class Client {
    public static void main(String[] args) {
        // 原始类对象,和责任链无关
        Director director = new Director();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 封装为责任链中的每个处理器并组成链
        LeaveApprovalHandler directorHandler = new LeaveApprovalHandler(director);
        LeaveApprovalHandler managerHandler = new LeaveApprovalHandler(manager);
        LeaveApprovalHandler generalManagerHandler = new LeaveApprovalHandler(generalManager);
        directorHandler.setSuccessor(managerHandler);
        managerHandler.setSuccessor(generalManagerHandler);


        directorHandler.approveLeave(40);
    }
}

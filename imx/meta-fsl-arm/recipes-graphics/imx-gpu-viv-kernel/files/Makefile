obj-m := galcore.o

SRC := $(shell pwd)

all:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC)/imx-gpu-viv-kernel-5.0.11.p4.1

modules_install:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC)/imx-gpu-viv-kernel-5.0.11.p4.1 modules_install

clean:
	rm -f *.o *~ core .depend .*.cmd *.ko *.mod.c
	rm -f Module.markers Module.symvers modules.order
	rm -rf .tmp_versions Modules.symvers

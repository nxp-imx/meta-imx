# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

do_configure_append() {    
    if [ "${USE_GPU_VIV_MODULE}" = "1" ]; then        
        sed -i s/CONFIG_MXC_GPU_VIV=y/CONFIG_MXC_GPU_VIV=n/g ${S}/.config
        sed -i s/CONFIG_MXC_GPU_VIV=y/CONFIG_MXC_GPU_VIV=n/g ${S}/../defconfig
    fi
}

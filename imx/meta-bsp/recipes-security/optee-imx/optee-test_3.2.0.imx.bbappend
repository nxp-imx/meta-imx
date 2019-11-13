SRCBRANCH = "imx_3.2.y"
SRCREV = "b7114b828b82f2c0eec124ed424eff1230cc5319"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH}"
SRC_URI_append = " file://0001-fix-build-failure-with-GCC-9.patch"                             

do_compile () {                                                                 
    if [ ${TRANSLATED_TARGET_ARCH} = "aarch64" ];then                           
        export TA_DEV_KIT_DIR=${STAGING_INCDIR}/optee/export-user_ta_arm64/     
        export ARCH=arm64                                                       
    else                                                                        
        export TA_DEV_KIT_DIR=${STAGING_INCDIR}/optee/export-user_ta_arm32/     
        export ARCH=arm                                                         
    fi                                                                          
    export ARCH=${OPTEE_ARCH}                                                   
    export OPTEE_CLIENT_EXPORT=${STAGING_DIR_HOST}/usr                          
    export CROSS_COMPILE_HOST=${HOST_PREFIX}                                    
    export CROSS_COMPILE_TA=${HOST_PREFIX}                                      
    export CROSS_COMPILE=${HOST_PREFIX}                                         
    export OPTEE_OPENSSL_EXPORT=${STAGING_INCDIR}/                              
    oe_runmake V=1 --warn-undefined-variables                                   
}


# A function based on create_symlinks in image.bbclass.
# We want to provide old-style .sdcard links to help the transition
# to the new image suffix .wic.
fakeroot python do_image_create_sdcard_symlink () {
    deploy_dir = d.getVar('IMGDEPLOYDIR')
    img_name = d.getVar('IMAGE_NAME')
    link_name = d.getVar('IMAGE_LINK_NAME')
    manifest_name = d.getVar('IMAGE_MANIFEST')
    taskname = "image_wic"
    subimages = (d.getVarFlag("do_" + taskname, 'subimages', False) or "").split()
    imgsuffix = d.getVarFlag("do_" + taskname, 'imgsuffix') or d.expand("${IMAGE_NAME_SUFFIX}.")

    if not link_name:
        return
    for type in subimages:
        if not type.startswith("wic") or type.endswith("bmap"):
            continue
        def create_symlink(src, dst):
            if os.path.exists(os.path.join(deploy_dir, src)):
                bb.note("Creating symlink: %s -> %s" % (dst, src))
                if os.path.islink(dst):
                    os.remove(dst)
                os.symlink(src, dst)
            else:
                bb.note("Skipping symlink, source does not exist: %s -> %s" % (dst, src))
        src = img_name + imgsuffix + type
        type = type.replace("wic", "sdcard")
        dst = os.path.join(deploy_dir, link_name + "." + type)
        create_symlink(src, dst)
        dst = os.path.join(deploy_dir, img_name + imgsuffix + type)
        create_symlink(src, dst)
}

addtask do_image_create_sdcard_symlink after do_image_wic before do_image_complete

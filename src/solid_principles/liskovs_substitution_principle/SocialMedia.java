package solid_principles.liskovs_substitution_principle;

public abstract class SocialMedia {

    // @Support Whatsapp, Facebook, Instagram
    public abstract void chatWithFriend();

    // @Support Facebook, Instagram
    public abstract void publishPost(Object object);

    // @Support Whatsapp, Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    // @Support Whatsapp, Facebook
    public abstract void groupVideoCall(String... users);
}
